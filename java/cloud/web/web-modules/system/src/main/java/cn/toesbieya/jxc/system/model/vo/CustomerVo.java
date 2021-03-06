package cn.toesbieya.jxc.system.model.vo;

import cn.toesbieya.jxc.common.model.entity.SysCustomer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CustomerVo extends SysCustomer {
    private String region_name;

    public CustomerVo(SysCustomer parent) {
        this.setId(parent.getId());
        this.setName(parent.getName());
        this.setAddress(parent.getAddress());
        this.setLinkman(parent.getLinkman());
        this.setLinkphone(parent.getLinkphone());
        this.setRegion(parent.getRegion());
        this.setStatus(parent.getStatus());
        this.setCtime(parent.getCtime());
        this.setRemark(parent.getRemark());
    }
}
