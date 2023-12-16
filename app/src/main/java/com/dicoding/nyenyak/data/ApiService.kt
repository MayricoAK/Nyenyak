package com.dicoding.nyenyak.data

import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @Headers("Authorization: Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlNzgyM2VmMDFiZDRkMmI5NjI3NDE2NThkMjA4MDdlZmVlNmRlNWMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vbnllbnlhay1wcm9qZWN0LWRldiIsImF1ZCI6Im55ZW55YWstcHJvamVjdC1kZXYiLCJhdXRoX3RpbWUiOjE3MDI3MTY4OTQsInVzZXJfaWQiOiJuVTFaSWl5TXJIZzVRcTNHN2FKMHNkb1lyT3MyIiwic3ViIjoiblUxWklpeU1ySGc1UXEzRzdhSjBzZG9Zck9zMiIsImlhdCI6MTcwMjcxNjg5NCwiZXhwIjoxNzAyNzIwNDk0LCJlbWFpbCI6InRlc3QxQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJ0ZXN0MUBnbWFpbC5jb20iXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwYXNzd29yZCJ9fQ.H6NOirKEClgvPiuRnHLW0QrHlFNiwquMErp6UWN_XAQZVy0MJdNLiEAGimPdTlKug-IBZ3rSWbn4oh0m0ui6_ejYK2V1D7emzx1D3K017IUJcbsXRvzsqxLdb2UUs9ZSnHVgUdztpkS7jLHZ_mGVIC5Xe-Wz5udHoUKrYE6yoOTbGRFMu4OIr8OxXZf0GUBPeomjVOim9VzHCrKiLOtPjDTFO3meeltM9dUKBHtRFwdHWN2B20-jemHj9YS0n06LQDM0ouFt4IRjmEJocsSnGwV3wh527FoFE7aXD5cCRwC488oBD8Se4XDDVOC2ldE73hQV9qNtNwsxAmfb6W9tyQ")
    @FormUrlEncoded
    @POST("diagnosis")
    suspend fun inputDiagnosis(
        @Field("weight") weight: Int,
        @Field("height") height: Int,
        @Field("sleepDuration") sleepDuration: Float,
        @Field("qualityOfSleep") qualityOfSleep: Int,
        @Field("physicalActivityLevel") physicalActivityLevel: Int,
        @Field("bloodPressure") bloodPressure: String,
        @Field("stressLevel") stressLevel: Int,
        @Field("heartRate") heartRate: Int,
        @Field("dailySteps") dailySteps: Int
    ): InputResponse

    @Headers("Authorization: Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlNzgyM2VmMDFiZDRkMmI5NjI3NDE2NThkMjA4MDdlZmVlNmRlNWMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vbnllbnlhay1wcm9qZWN0LWRldiIsImF1ZCI6Im55ZW55YWstcHJvamVjdC1kZXYiLCJhdXRoX3RpbWUiOjE3MDI3MTY4OTQsInVzZXJfaWQiOiJuVTFaSWl5TXJIZzVRcTNHN2FKMHNkb1lyT3MyIiwic3ViIjoiblUxWklpeU1ySGc1UXEzRzdhSjBzZG9Zck9zMiIsImlhdCI6MTcwMjcxNjg5NCwiZXhwIjoxNzAyNzIwNDk0LCJlbWFpbCI6InRlc3QxQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJ0ZXN0MUBnbWFpbC5jb20iXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwYXNzd29yZCJ9fQ.H6NOirKEClgvPiuRnHLW0QrHlFNiwquMErp6UWN_XAQZVy0MJdNLiEAGimPdTlKug-IBZ3rSWbn4oh0m0ui6_ejYK2V1D7emzx1D3K017IUJcbsXRvzsqxLdb2UUs9ZSnHVgUdztpkS7jLHZ_mGVIC5Xe-Wz5udHoUKrYE6yoOTbGRFMu4OIr8OxXZf0GUBPeomjVOim9VzHCrKiLOtPjDTFO3meeltM9dUKBHtRFwdHWN2B20-jemHj9YS0n06LQDM0ouFt4IRjmEJocsSnGwV3wh527FoFE7aXD5cCRwC488oBD8Se4XDDVOC2ldE73hQV9qNtNwsxAmfb6W9tyQ")
    @GET("diagnosis")
    fun getalldiagnosis() : Call<List<GetDiagnosisResponseItem>>

    @GET("diagnosis/{id]")
    suspend fun getdetaildiagnosis(@Path("id") id: String) : GetDiagnosisResponseItem

    @Headers("Authorization: Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlNzgyM2VmMDFiZDRkMmI5NjI3NDE2NThkMjA4MDdlZmVlNmRlNWMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vbnllbnlhay1wcm9qZWN0LWRldiIsImF1ZCI6Im55ZW55YWstcHJvamVjdC1kZXYiLCJhdXRoX3RpbWUiOjE3MDI3MTY4OTQsInVzZXJfaWQiOiJuVTFaSWl5TXJIZzVRcTNHN2FKMHNkb1lyT3MyIiwic3ViIjoiblUxWklpeU1ySGc1UXEzRzdhSjBzZG9Zck9zMiIsImlhdCI6MTcwMjcxNjg5NCwiZXhwIjoxNzAyNzIwNDk0LCJlbWFpbCI6InRlc3QxQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJ0ZXN0MUBnbWFpbC5jb20iXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwYXNzd29yZCJ9fQ.H6NOirKEClgvPiuRnHLW0QrHlFNiwquMErp6UWN_XAQZVy0MJdNLiEAGimPdTlKug-IBZ3rSWbn4oh0m0ui6_ejYK2V1D7emzx1D3K017IUJcbsXRvzsqxLdb2UUs9ZSnHVgUdztpkS7jLHZ_mGVIC5Xe-Wz5udHoUKrYE6yoOTbGRFMu4OIr8OxXZf0GUBPeomjVOim9VzHCrKiLOtPjDTFO3meeltM9dUKBHtRFwdHWN2B20-jemHj9YS0n06LQDM0ouFt4IRjmEJocsSnGwV3wh527FoFE7aXD5cCRwC488oBD8Se4XDDVOC2ldE73hQV9qNtNwsxAmfb6W9tyQ")
    @DELETE("diagnosis/{id}")
    suspend fun deletediagnosis(@Path("id") id: String): DeleteResponse
}