package org.liu.fund.dao.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2020-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fund_info")
@ApiModel(value="FundInfoModel对象", description="")
public class FundInfoModel extends Model<FundInfoModel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String fundCode;

    private String fundName;

    private String fundNameAbbreviation;

    private String fundNamePinyin;

    @TableField("Investment_target_type")
    private String investmentTargetType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
