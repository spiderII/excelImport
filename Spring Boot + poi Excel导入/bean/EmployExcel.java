package com.wintech.soli.cmsplat.business.excelImport.bean;/**
 * Created by yeguijun on 2018/6/25.
 */

import com.wintech.soli.whutils.validate.constraint.Email;
import com.wintech.soli.whutils.validate.constraint.Phone;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: EmployExcel
 * @Description:
 * @Author: yeguijun
 * @Date: 2018/6/25 16:47
 * @Version: 1.0.0
 */
public class EmployExcel implements Serializable {
    /**
     * 主键ID
     */
    @NotNull
    @ApiModelProperty(value = "主键ID")
    private Integer emplId;

    /**
     * 员工姓名
     */
    @ApiModelProperty(value = "员工姓名")
    private String emplName;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String emplNickName;

    /**
     * 邮箱
     */
    @Email
    @ApiModelProperty(value = "邮箱")
    private String emplEmail;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer emplGender;

    /**
     * 手机号码
     */
    @Phone
    @ApiModelProperty(value = "手机号码")
    private String emplPhone;

    /**
     * 部门/职位
     */
    @ApiModelProperty(value = "职位")
    private String emplDeptJob;

    /**
     * 是否为公历
     */
    @ApiModelProperty(value = "是否为公历")
    private Integer emplIsTgcr;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    private Date emplBirthday;

    /**
     * 个人简介
     */
    @ApiModelProperty(value = "个人简介")
    private String emplIntroduction;

    /**
     * 所属公司
     */
    @ApiModelProperty(value = "所属公司")
    private Integer compId;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Short emplStatus;

    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Integer roleId;

    /**
     * 帖子总数
     */
    @ApiModelProperty(value = "帖子总数")
    private Integer emplTopicNum;

    /**
     * 举报帖子总数
     */
    @ApiModelProperty(value = "举报帖子总数")
    private Integer emplTopicReport;

    /**
     * 生日评论总数
     */
    @ApiModelProperty(value = "生日评论总数")
    private Integer emplRebirtNum;
    /**
     * 头像路径
     */
    @ApiModelProperty(value = "头像路径")
    private String emplIconPath;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateDate;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public EmployExcel(Integer emplId, String emplName, String emplNickName, String emplEmail, Integer emplGender,
                       String emplPhone, String emplDeptJob, Integer emplIsTgcr, Date emplBirthday,
                       String emplIntroduction, Integer compId, Short emplStatus, Integer roleId,
                       Integer emplTopicNum, Integer emplTopicReport, Integer emplRebirtNum, String emplIconPath, Date updateDate, Date createDate) {
        this.emplId = emplId;
        this.emplName = emplName;
        this.emplNickName = emplNickName;
        this.emplEmail = emplEmail;
        this.emplGender = emplGender;
        this.emplPhone = emplPhone;
        this.emplDeptJob = emplDeptJob;
        this.emplIsTgcr = emplIsTgcr;
        this.emplBirthday = emplBirthday;
        this.emplIntroduction = emplIntroduction;
        this.compId = compId;
        this.emplStatus = emplStatus;
        this.roleId = roleId;
        this.emplTopicNum = emplTopicNum;
        this.emplTopicReport = emplTopicReport;
        this.emplRebirtNum = emplRebirtNum;
        this.emplIconPath = emplIconPath;
        this.updateDate = updateDate;
        this.createDate = createDate;
    }

    public EmployExcel(){
        super();
    }

    public Integer getEmplId() {
        return emplId;
    }

    public void setEmplId(Integer emplId) {
        this.emplId = emplId;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplNickName() {
        return emplNickName;
    }

    public void setEmplNickName(String emplNickName) {
        this.emplNickName = emplNickName;
    }

    public String getEmplEmail() {
        return emplEmail;
    }

    public void setEmplEmail(String emplEmail) {
        this.emplEmail = emplEmail;
    }

    public Integer getEmplGender() {
        return emplGender;
    }

    public void setEmplGender(Integer emplGender) {
        this.emplGender = emplGender;
    }

    public String getEmplPhone() {
        return emplPhone;
    }

    public void setEmplPhone(String emplPhone) {
        this.emplPhone = emplPhone;
    }

    public String getEmplDeptJob() {
        return emplDeptJob;
    }

    public void setEmplDeptJob(String emplDeptJob) {
        this.emplDeptJob = emplDeptJob;
    }

    public Integer getEmplIsTgcr() {
        return emplIsTgcr;
    }

    public void setEmplIsTgcr(Integer emplIsTgcr) {
        this.emplIsTgcr = emplIsTgcr;
    }

    public Date getEmplBirthday() {
        return emplBirthday;
    }

    public void setEmplBirthday(Date emplBirthday) {
        this.emplBirthday = emplBirthday;
    }

    public String getEmplIntroduction() {
        return emplIntroduction;
    }

    public void setEmplIntroduction(String emplIntroduction) {
        this.emplIntroduction = emplIntroduction;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Short getEmplStatus() {
        return emplStatus;
    }

    public void setEmplStatus(Short emplStatus) {
        this.emplStatus = emplStatus;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getEmplTopicNum() {
        return emplTopicNum;
    }

    public void setEmplTopicNum(Integer emplTopicNum) {
        this.emplTopicNum = emplTopicNum;
    }

    public Integer getEmplTopicReport() {
        return emplTopicReport;
    }

    public void setEmplTopicReport(Integer emplTopicReport) {
        this.emplTopicReport = emplTopicReport;
    }

    public Integer getEmplRebirtNum() {
        return emplRebirtNum;
    }

    public void setEmplRebirtNum(Integer emplRebirtNum) {
        this.emplRebirtNum = emplRebirtNum;
    }

    public String getEmplIconPath() {
        return emplIconPath;
    }

    public void setEmplIconPath(String emplIconPath) {
        this.emplIconPath = emplIconPath;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmployExcel other = (EmployExcel) that;
        return (this.getEmplId() == null ? other.getEmplId() == null : this.getEmplId().equals(other.getEmplId()))
                && (this.getEmplName() == null ? other.getEmplName() == null : this.getEmplName().equals(other.getEmplName()))
                && (this.getEmplNickName() == null ? other.getEmplNickName() == null : this.getEmplNickName().equals(other.getEmplNickName()))
                && (this.getEmplEmail() == null ? other.getEmplEmail() == null : this.getEmplEmail().equals(other.getEmplEmail()))
                && (this.getEmplGender() == null ? other.getEmplGender() == null : this.getEmplGender().equals(other.getEmplGender()))
                && (this.getEmplPhone() == null ? other.getEmplPhone() == null : this.getEmplPhone().equals(other.getEmplPhone()))
                && (this.getEmplDeptJob() == null ? other.getEmplDeptJob() == null : this.getEmplDeptJob().equals(other.getEmplDeptJob()))
                && (this.getEmplIsTgcr() == null ? other.getEmplIsTgcr() == null : this.getEmplIsTgcr().equals(other.getEmplIsTgcr()))
                && (this.getEmplBirthday() == null ? other.getEmplBirthday() == null : this.getEmplBirthday().equals(other.getEmplBirthday()))
                && (this.getEmplIntroduction() == null ? other.getEmplIntroduction() == null : this.getEmplIntroduction().equals(other.getEmplIntroduction()))
                && (this.getCompId() == null ? other.getCompId() == null : this.getCompId().equals(other.getCompId()))
                && (this.getEmplTopicNum() == null ? other.getEmplTopicNum() == null : this.getEmplTopicNum().equals(other.getEmplTopicNum()))
                && (this.getEmplTopicReport() == null ? other.getEmplTopicReport() == null : this.getEmplTopicReport().equals(other.getEmplTopicReport()))
                && (this.getEmplRebirtNum() == null ? other.getEmplRebirtNum() == null : this.getEmplRebirtNum().equals(other.getEmplRebirtNum()))
                && (this.getEmplIconPath() == null ? other.getEmplIconPath() == null : this.getEmplIconPath().equals(other.getEmplIconPath()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmplId() == null) ? 0 : getEmplId().hashCode());
        result = prime * result + ((getEmplName() == null) ? 0 : getEmplName().hashCode());
        result = prime * result + ((getEmplNickName() == null) ? 0 : getEmplNickName().hashCode());
        result = prime * result + ((getEmplEmail() == null) ? 0 : getEmplEmail().hashCode());
        result = prime * result + ((getEmplGender() == null) ? 0 : getEmplGender().hashCode());
        result = prime * result + ((getEmplPhone() == null) ? 0 : getEmplPhone().hashCode());
        result = prime * result + ((getEmplDeptJob() == null) ? 0 : getEmplDeptJob().hashCode());
        result = prime * result + ((getEmplIsTgcr() == null) ? 0 : getEmplIsTgcr().hashCode());
        result = prime * result + ((getEmplBirthday() == null) ? 0 : getEmplBirthday().hashCode());
        result = prime * result + ((getEmplIntroduction() == null) ? 0 : getEmplIntroduction().hashCode());
        result = prime * result + ((getCompId() == null) ? 0 : getCompId().hashCode());
        result = prime * result + ((getEmplTopicNum() == null) ? 0 : getEmplTopicNum().hashCode());
        result = prime * result + ((getEmplTopicReport() == null) ? 0 : getEmplTopicReport().hashCode());
        result = prime * result + ((getEmplRebirtNum() == null) ? 0 : getEmplRebirtNum().hashCode());
        result = prime * result + ((getEmplIconPath() == null) ? 0 : getEmplIconPath().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}
