package com.example.rank.entity

data class WealthLevel(
    val background_color_left: String,
    val background_color_right: String,
    val color: String,
    val enter_room_color_left: String,
    val enter_room_color_right: String,
    val image_url: String,
    val level_image: String,
    val name: String,
    val value: Int
) {
}