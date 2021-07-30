package com.example.rank.entity

data class UserInfo(
    val age: Int,
    val charmLevel: CharmLevel,
    val chatUserName: String,
    val commTags: List<Any>,
    val hatList: List<Any>,
    val headUrl: String,
    val imInfoList: List<Any>,
    val isNewNoble: Int,
    val isRealName: Int,
    val is_gift_animation: Boolean,
    val is_liang_num: Boolean,
    val level: Int,
    val levelPicHeight: Int,
    val levelPicUrl: String,
    val levelPicWidth: Int,
    val location: String,
    val newTaskInfo: List<Any>,
    val nick: String,
    val personalityLabelInfos: List<Any>,
    val sex: Int,
    val showUid: Int,
    val uid: Int,
    val userHatInfo: UserHatInfo,
    val wealthLevel: WealthLevel
) {
}