package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @TableName checkrelation
 */
@TableName(value = "checkrelation")
public class Checkrelation {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目ID
     */
    @TableField(value = "CheckProjID")
    private Integer checkprojid;

    /**
     * 申请模板ID
     */
    @TableField(value = "CheckTempID")
    private Integer checktempid;

    /**
     * 检查部位
     */
    @TableField(value = "Position")
    private String position;

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
     * 项目ID
     */
    public Integer getCheckprojid() {
        return checkprojid;
    }

    /**
     * 项目ID
     */
    public void setCheckprojid(Integer checkprojid) {
        this.checkprojid = checkprojid;
    }

    /**
     * 申请模板ID
     */
    public Integer getChecktempid() {
        return checktempid;
    }

    /**
     * 申请模板ID
     */
    public void setChecktempid(Integer checktempid) {
        this.checktempid = checktempid;
    }

    /**
     * 检查部位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 检查部位
     */
    public void setPosition(String position) {
        this.position = position;
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
        Checkrelation other = (Checkrelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCheckprojid() == null ? other.getCheckprojid() == null : this.getCheckprojid().equals(other.getCheckprojid()))
                && (this.getChecktempid() == null ? other.getChecktempid() == null : this.getChecktempid().equals(other.getChecktempid()))
                && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCheckprojid() == null) ? 0 : getCheckprojid().hashCode());
        result = prime * result + ((getChecktempid() == null) ? 0 : getChecktempid().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", checkprojid=").append(checkprojid);
        sb.append(", checktempid=").append(checktempid);
        sb.append(", position=").append(position);
        sb.append("]");
        return sb.toString();
    }
}