package sm.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserUserInfo {
    private Integer userId;

    private String userName;

    private String nickname;

    private String mobile;

    private Integer userGradeId;

    private String userPwd;

    private BigDecimal cumulativeConsume;

    private BigDecimal balance;

    private Integer integral;

    private Integer userAreaId;

    private Date userCreateTime;

    private Short userDeleteFlag;

    private Date userUpdateTime;

    private String userPortraitUri;

    private String userAddress;

    private Integer userSex;

    private String userContactFriendAlias;

    private Integer userContactId;

    private String userBgUrl;

    private Integer userRegionId;

    private Integer userDeptId;

    private String openid;
    private String platform;

    private String userShowTime;

    private String userLikeVideo;

    private String userLikeMusic;

    private String userLivePic;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getUserGradeId() {
        return userGradeId;
    }

    public void setUserGradeId(Integer userGradeId) {
        this.userGradeId = userGradeId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public BigDecimal getCumulativeConsume() {
        return cumulativeConsume;
    }

    public void setCumulativeConsume(BigDecimal cumulativeConsume) {
        this.cumulativeConsume = cumulativeConsume;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getUserAreaId() {
        return userAreaId;
    }

    public void setUserAreaId(Integer userAreaId) {
        this.userAreaId = userAreaId;
    }

    public Short getUserDeleteFlag() {
        return userDeleteFlag;
    }

    public void setUserDeleteFlag(Short userDeleteFlag) {
        this.userDeleteFlag = userDeleteFlag;
    }

    public String getUserPortraitUri() {
        return userPortraitUri;
    }

    public void setUserPortraitUri(String userPortraitUri) {
        this.userPortraitUri = userPortraitUri;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserContactFriendAlias() {
        return userContactFriendAlias;
    }

    public void setUserContactFriendAlias(String userContactFriendAlias) {
        this.userContactFriendAlias = userContactFriendAlias;
    }

    public Integer getUserContactId() {
        return userContactId;
    }

    public void setUserContactId(Integer userContactId) {
        this.userContactId = userContactId;
    }

    public String getUserBgUrl() {
        return userBgUrl;
    }

    public void setUserBgUrl(String userBgUrl) {
        this.userBgUrl = userBgUrl;
    }

    public Integer getUserDeptId() {
        return userDeptId;
    }

    public void setUserDeptId(Integer userDeptId) {
        this.userDeptId = userDeptId;
    }

    public Integer getUserRegionId() {
        return userRegionId;
    }

    public void setUserRegionId(Integer userRegionId) {
        this.userRegionId = userRegionId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "UserUserInfo{" +
                "balance=" + balance +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userGradeId=" + userGradeId +
                ", userPwd='" + userPwd + '\'' +
                ", cumulativeConsume=" + cumulativeConsume +
                ", integral=" + integral +
                ", userAreaId=" + userAreaId +
                ", userCreateTime=" + userCreateTime +
                ", userDeleteFlag=" + userDeleteFlag +
                ", userUpdateTime=" + userUpdateTime +
                ", userPortraitUri='" + userPortraitUri + '\'' +
                '}';
    }

    public String getUserShowTime() {
        return userShowTime;
    }

    public void setUserShowTime(String userShowTime) {
        this.userShowTime = userShowTime;
    }


    public String getUserLikeVideo() {
        return userLikeVideo;
    }

    public void setUserLikeVideo(String userLikeVideo) {
        this.userLikeVideo = userLikeVideo;
    }

    public String getUserLikeMusic() {
        return userLikeMusic;
    }

    public void setUserLikeMusic(String userLikeMusic) {
        this.userLikeMusic = userLikeMusic;
    }

    public String getUserLivePic() {
        return userLivePic;
    }

    public void setUserLivePic(String userLivePic) {
        this.userLivePic = userLivePic;
    }
}