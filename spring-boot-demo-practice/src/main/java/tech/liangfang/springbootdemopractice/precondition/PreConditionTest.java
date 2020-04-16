package tech.liangfang.springbootdemopractice.precondition;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/15 15:44
 */
public class PreConditionTest {

    public static void main(String[] args) {

        String appId = "";

        Preconditions.checkArgument(StringUtils.isNotBlank(appId), "appId");

    }

}
