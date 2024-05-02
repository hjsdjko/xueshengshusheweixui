package com.entity.model;

import com.entity.GuzhangshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 故障上报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuzhangshangbaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 任务编号
     */
    private String guzhangshangbaoUuidNumber;


    /**
     * 区域
     */
    private Integer quyuTypes;


    /**
     * 所在区域
     */
    private String guzhangshangbaoAddress;


    /**
     * 故障信息
     */
    private String guzhangshangbaoGuzhang;


    /**
     * 故障类型
     */
    private Integer guzhangshangbaoTypes;


    /**
     * 维修人员
     */
    private Integer weixiuyuanId;


    /**
     * 处理结果
     */
    private Integer chulijieguoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：任务编号
	 */
    public String getGuzhangshangbaoUuidNumber() {
        return guzhangshangbaoUuidNumber;
    }


    /**
	 * 设置：任务编号
	 */
    public void setGuzhangshangbaoUuidNumber(String guzhangshangbaoUuidNumber) {
        this.guzhangshangbaoUuidNumber = guzhangshangbaoUuidNumber;
    }
    /**
	 * 获取：区域
	 */
    public Integer getQuyuTypes() {
        return quyuTypes;
    }


    /**
	 * 设置：区域
	 */
    public void setQuyuTypes(Integer quyuTypes) {
        this.quyuTypes = quyuTypes;
    }
    /**
	 * 获取：所在区域
	 */
    public String getGuzhangshangbaoAddress() {
        return guzhangshangbaoAddress;
    }


    /**
	 * 设置：所在区域
	 */
    public void setGuzhangshangbaoAddress(String guzhangshangbaoAddress) {
        this.guzhangshangbaoAddress = guzhangshangbaoAddress;
    }
    /**
	 * 获取：故障信息
	 */
    public String getGuzhangshangbaoGuzhang() {
        return guzhangshangbaoGuzhang;
    }


    /**
	 * 设置：故障信息
	 */
    public void setGuzhangshangbaoGuzhang(String guzhangshangbaoGuzhang) {
        this.guzhangshangbaoGuzhang = guzhangshangbaoGuzhang;
    }
    /**
	 * 获取：故障类型
	 */
    public Integer getGuzhangshangbaoTypes() {
        return guzhangshangbaoTypes;
    }


    /**
	 * 设置：故障类型
	 */
    public void setGuzhangshangbaoTypes(Integer guzhangshangbaoTypes) {
        this.guzhangshangbaoTypes = guzhangshangbaoTypes;
    }
    /**
	 * 获取：维修人员
	 */
    public Integer getWeixiuyuanId() {
        return weixiuyuanId;
    }


    /**
	 * 设置：维修人员
	 */
    public void setWeixiuyuanId(Integer weixiuyuanId) {
        this.weixiuyuanId = weixiuyuanId;
    }
    /**
	 * 获取：处理结果
	 */
    public Integer getChulijieguoTypes() {
        return chulijieguoTypes;
    }


    /**
	 * 设置：处理结果
	 */
    public void setChulijieguoTypes(Integer chulijieguoTypes) {
        this.chulijieguoTypes = chulijieguoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
