const express = require('express');
const diagnosisRouter = require('./routes/diagnosis');
const authRouter = require('./routes/auth');
const { verifyFirebaseToken } = require('./config');

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use('/diagnosis', verifyFirebaseToken, diagnosisRouter);
app.use('/auth', authRouter); 

const port = process.env.PORT || 8080;

app.get('/', (req, res) => {
  res.send(`
  <p>Hello World!</p>
  <form action="http://localhost:8080/auth/google-login" method="post">
    <button type="submit">Google Login Test</button>
  </form>
`);
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});