package com.dicoding.nyenyak.data.response

import com.google.gson.annotations.SerializedName

data class ForgotResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
