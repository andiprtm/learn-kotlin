package com.example.mygithubapplication.data.remote.response

import com.google.gson.annotations.SerializedName

data class DetailUserResponse(

    @field:SerializedName("bio")
    val bio: String,

    @field:SerializedName("login")
    val login: String,

    @field:SerializedName("company")
    val company: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("public_gists")
    val publicGists: Int?,

    @field:SerializedName("public_repos")
    val publicRepos: Int?,

    @field:SerializedName("followers")
    val followers: Int,

    @field:SerializedName("avatar_url")
    val avatarUrl: String,

    @field:SerializedName("html_url")
    val htmlUrl: String,

    @field:SerializedName("following")
    val following: Int,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("location")
    val location: String
)
