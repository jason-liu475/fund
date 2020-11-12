package org.liu.fund.dao.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fund_suspend")
@ApiModel(value="FundSuspendModel对象", description="")
public class FundSuspendModel extends Model<FundSuspendModel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "基金代码")
    private String fundCode;

    @ApiModelProperty(value = "基金名称")
    private String fundName;

    @ApiModelProperty(value = "暂停赎回日期")
    private String suspendDate;

    @ApiModelProperty(value = "开放赎回日期")
    private String openDate;

    private Date createTime;

    private Date updateTime;

    @ApiModelProperty(value = "批次号")
    private String batchNum;
    @ApiModelProperty(value = "暂停类型 1:暂停申购 2:暂停赎回")
    private Integer suspendType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
