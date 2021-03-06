package com.stip.net.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysDictionary implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.id
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private Long id;

    @Override
	public String toString() {
		return "SysDictionary [id=" + id + ", dicType=" + dicType + ", dicName=" + dicName + ", dicIndex=" + dicIndex + ", dicKey=" + dicKey + ", isUpload=" + isUpload + ", createTime=" + createTime + ", remark=" + remark + ", childList=" + childList + "]";
	}

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.dic_type
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String dicType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.dic_name
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String dicName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.dic_index
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String dicIndex;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.dic_key
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String dicKey;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.is_upload
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String isUpload;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.create_time
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column t_sys_dictionary.remark
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private String remark;
    
    private List<SysDictionary> childList;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_sys_dictionary
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * 构造函数
     */
    public SysDictionary() {
        //Auto-generated Constructor stub
    }

    /**
     * 构造函数
     * @param id id
     */
    public SysDictionary(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.id
     *
     * @return the value of t_sys_dictionary.id
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.id
     *
     * @param id the value for t_sys_dictionary.id
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.dic_type
     *
     * @return the value of t_sys_dictionary.dic_type
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getDicType() {
        return dicType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.dic_type
     *
     * @param dicType the value for t_sys_dictionary.dic_type
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setDicType(String dicType) {
        this.dicType = dicType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.dic_name
     *
     * @return the value of t_sys_dictionary.dic_name
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getDicName() {
        return dicName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.dic_name
     *
     * @param dicName the value for t_sys_dictionary.dic_name
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.dic_index
     *
     * @return the value of t_sys_dictionary.dic_index
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getDicIndex() {
        return dicIndex;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.dic_index
     *
     * @param dicIndex the value for t_sys_dictionary.dic_index
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setDicIndex(String dicIndex) {
        this.dicIndex = dicIndex;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.dic_key
     *
     * @return the value of t_sys_dictionary.dic_key
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getDicKey() {
        return dicKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.dic_key
     *
     * @param dicKey the value for t_sys_dictionary.dic_key
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setDicKey(String dicKey) {
        this.dicKey = dicKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.is_upload
     *
     * @return the value of t_sys_dictionary.is_upload
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getIsUpload() {
        return isUpload;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.is_upload
     *
     * @param isUpload the value for t_sys_dictionary.is_upload
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setIsUpload(String isUpload) {
        this.isUpload = isUpload;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.create_time
     *
     * @return the value of t_sys_dictionary.create_time
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.create_time
     *
     * @param createTime the value for t_sys_dictionary.create_time
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column t_sys_dictionary.remark
     *
     * @return the value of t_sys_dictionary.remark
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column t_sys_dictionary.remark
     *
     * @param remark the value for t_sys_dictionary.remark
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<SysDictionary> getChildList() {
		return childList;
	}

	public void setChildList(List<SysDictionary> childList) {
		this.childList = childList;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_dictionary
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof SysDictionary)) {
            return false;
        }
        SysDictionary other = (SysDictionary) that;
        return this.getId() == null ? other == null : this.getId().equals(other.getId())
            && this.getDicType() == null ? other == null : this.getDicType().equals(other.getDicType())
            && this.getDicName() == null ? other == null : this.getDicName().equals(other.getDicName())
            && this.getDicIndex() == null ? other == null : this.getDicIndex().equals(other.getDicIndex())
            && this.getDicKey() == null ? other == null : this.getDicKey().equals(other.getDicKey())
            && this.getIsUpload() == null ? other == null : this.getIsUpload().equals(other.getIsUpload())
            && this.getCreateTime() == null ? other == null : this.getCreateTime().equals(other.getCreateTime())
            && this.getRemark() == null ? other == null : this.getRemark().equals(other.getRemark());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_dictionary
     *
     * @ibatorgenerated Tue Apr 12 11:44:07 CST 2016
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getId() != null) {
            hash *= getId().hashCode();
        }
        if (getDicType() != null) {
            hash *= getDicType().hashCode();
        }
        if (getDicName() != null) {
            hash *= getDicName().hashCode();
        }
        if (getDicIndex() != null) {
            hash *= getDicIndex().hashCode();
        }
        if (getDicKey() != null) {
            hash *= getDicKey().hashCode();
        }
        if (getIsUpload() != null) {
            hash *= getIsUpload().hashCode();
        }
        if (getCreateTime() != null) {
            hash *= getCreateTime().hashCode();
        }
        if (getRemark() != null) {
            hash *= getRemark().hashCode();
        }
        return hash;
    }
}