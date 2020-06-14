package org.liu.fund.dao.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuhuan
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fund_real_time_data")
@ApiModel(value="FundRealTimeDataModel对象", description="")
public class FundRealTimeDataModel extends Model<FundRealTimeDataModel> {

    private static final long serialVersionUID = 1L;
	@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "基金代码")
    private String fundCode;

    @ApiModelProperty(value = "基金名称")
    private String fundName;

    @ApiModelProperty(value = "净值日期")
    private Date jzrq;

    @ApiModelProperty(value = "单位净值")
    private String dwjz;

    @ApiModelProperty(value = "估算值")
    private String gsz;

    private String gszzl;

    @ApiModelProperty(value = "估值时间")
    private Date gztime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
