package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName medicalrecord
 */
@TableName(value ="medicalrecord")
public class Medicalrecord {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 病历号
     */
    @TableField(value = "CaseNumber")
    private String casenumber;

    /**
     * 挂号ID
     */
    @TableField(value = "RegistID")
    private Integer registid;

    /**
     * 主诉
     */
    @TableField(value = "Readme")
    private String readme;

    /**
     * 现病史
     */
    @TableField(value = "Present")
    private String present;

    /**
     * 现病治疗情况
     */
    @TableField(value = "PresentTreat")
    private String presenttreat;

    /**
     * 既往史
     */
    @TableField(value = "History")
    private String history;

    /**
     * 过敏史
     */
    @TableField(value = "Allergy")
    private String allergy;

    /**
     * 体格检查
     */
    @TableField(value = "Physique")
    private String physique;

    /**
     * 检查建议
     */
    @TableField(value = "Proposal")
    private String proposal;

    /**
     * 注意事项
     */
    @TableField(value = "Careful")
    private String careful;

    /**
     * 检查结果
     */
    @TableField(value = "CheckResult")
    private String checkresult;

    /**
     * 诊断结果
     */
    @TableField(value = "Diagnosis")
    private String diagnosis;

    /**
     * 处理意见
     */
    @TableField(value = "Handling")
    private String handling;

    /**
     * 病历状态 1-暂存 2-已提交 3-诊毕
     */
    @TableField(value = "CaseState")
    private Integer casestate;

    /**
     * ID主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 病历号
     */
    public String getCasenumber() {
        return casenumber;
    }

    /**
     * 病历号
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }

    /**
     * 挂号ID
     */
    public Integer getRegistid() {
        return registid;
    }

    /**
     * 挂号ID
     */
    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    /**
     * 主诉
     */
    public String getReadme() {
        return readme;
    }

    /**
     * 主诉
     */
    public void setReadme(String readme) {
        this.readme = readme;
    }

    /**
     * 现病史
     */
    public String getPresent() {
        return present;
    }

    /**
     * 现病史
     */
    public void setPresent(String present) {
        this.present = present;
    }

    /**
     * 现病治疗情况
     */
    public String getPresenttreat() {
        return presenttreat;
    }

    /**
     * 现病治疗情况
     */
    public void setPresenttreat(String presenttreat) {
        this.presenttreat = presenttreat;
    }

    /**
     * 既往史
     */
    public String getHistory() {
        return history;
    }

    /**
     * 既往史
     */
    public void setHistory(String history) {
        this.history = history;
    }

    /**
     * 过敏史
     */
    public String getAllergy() {
        return allergy;
    }

    /**
     * 过敏史
     */
    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    /**
     * 体格检查
     */
    public String getPhysique() {
        return physique;
    }

    /**
     * 体格检查
     */
    public void setPhysique(String physique) {
        this.physique = physique;
    }

    /**
     * 检查建议
     */
    public String getProposal() {
        return proposal;
    }

    /**
     * 检查建议
     */
    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    /**
     * 注意事项
     */
    public String getCareful() {
        return careful;
    }

    /**
     * 注意事项
     */
    public void setCareful(String careful) {
        this.careful = careful;
    }

    /**
     * 检查结果
     */
    public String getCheckresult() {
        return checkresult;
    }

    /**
     * 检查结果
     */
    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    /**
     * 诊断结果
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 诊断结果
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * 处理意见
     */
    public String getHandling() {
        return handling;
    }

    /**
     * 处理意见
     */
    public void setHandling(String handling) {
        this.handling = handling;
    }

    /**
     * 病历状态 1-暂存 2-已提交 3-诊毕
     */
    public Integer getCasestate() {
        return casestate;
    }

    /**
     * 病历状态 1-暂存 2-已提交 3-诊毕
     */
    public void setCasestate(Integer casestate) {
        this.casestate = casestate;
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
        Medicalrecord other = (Medicalrecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCasenumber() == null ? other.getCasenumber() == null : this.getCasenumber().equals(other.getCasenumber()))
            && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
            && (this.getReadme() == null ? other.getReadme() == null : this.getReadme().equals(other.getReadme()))
            && (this.getPresent() == null ? other.getPresent() == null : this.getPresent().equals(other.getPresent()))
            && (this.getPresenttreat() == null ? other.getPresenttreat() == null : this.getPresenttreat().equals(other.getPresenttreat()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()))
            && (this.getAllergy() == null ? other.getAllergy() == null : this.getAllergy().equals(other.getAllergy()))
            && (this.getPhysique() == null ? other.getPhysique() == null : this.getPhysique().equals(other.getPhysique()))
            && (this.getProposal() == null ? other.getProposal() == null : this.getProposal().equals(other.getProposal()))
            && (this.getCareful() == null ? other.getCareful() == null : this.getCareful().equals(other.getCareful()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getHandling() == null ? other.getHandling() == null : this.getHandling().equals(other.getHandling()))
            && (this.getCasestate() == null ? other.getCasestate() == null : this.getCasestate().equals(other.getCasestate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCasenumber() == null) ? 0 : getCasenumber().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getReadme() == null) ? 0 : getReadme().hashCode());
        result = prime * result + ((getPresent() == null) ? 0 : getPresent().hashCode());
        result = prime * result + ((getPresenttreat() == null) ? 0 : getPresenttreat().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        result = prime * result + ((getAllergy() == null) ? 0 : getAllergy().hashCode());
        result = prime * result + ((getPhysique() == null) ? 0 : getPhysique().hashCode());
        result = prime * result + ((getProposal() == null) ? 0 : getProposal().hashCode());
        result = prime * result + ((getCareful() == null) ? 0 : getCareful().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getHandling() == null) ? 0 : getHandling().hashCode());
        result = prime * result + ((getCasestate() == null) ? 0 : getCasestate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", casenumber=").append(casenumber);
        sb.append(", registid=").append(registid);
        sb.append(", readme=").append(readme);
        sb.append(", present=").append(present);
        sb.append(", presenttreat=").append(presenttreat);
        sb.append(", history=").append(history);
        sb.append(", allergy=").append(allergy);
        sb.append(", physique=").append(physique);
        sb.append(", proposal=").append(proposal);
        sb.append(", careful=").append(careful);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", handling=").append(handling);
        sb.append(", casestate=").append(casestate);
        sb.append("]");
        return sb.toString();
    }
}