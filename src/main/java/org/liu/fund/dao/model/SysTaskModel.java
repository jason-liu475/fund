package org.liu.fund.dao.model;

import java.io.Serializable;

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
@TableName("sys_task")
@ApiModel(value="SysTaskModel对象", description="")
public class SysTaskModel extends Model<SysTaskModel> {

    private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务名称")
    private String taskName;

    @ApiModelProperty(value = "任务代码")
    private String taskCode;

    @ApiModelProperty(value = "是否完成 1:完成，0:未完成")
    private Integer isFinish;

    @ApiModelProperty(value = "重试次数")
    private Integer retryCount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
