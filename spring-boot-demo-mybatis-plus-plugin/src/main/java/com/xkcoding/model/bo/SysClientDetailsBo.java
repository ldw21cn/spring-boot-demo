package com.xkcoding.model.bo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:38
 * @since jdk1.8
 */
@Setter
@Getter
public class SysClientDetailsBo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Integer accessTokenValiditySeconds;
    /**
     *
     */
    private String authorizations;
    /**
     *
     */
    private String autoApproveScopes;
    /**
     *
     */
    private String clientId;
    /**
     *
     */
    private String clientSecret;
    /**
     *
     */
    private String grantTypes;
    /**
     *
     */
    private String redirectUrl;
    /**
     *
     */
    private Integer refreshTokenValiditySeconds;
    /**
     *
     */
    private String resourceIds;
    /**
     *
     */
    private String scopes;
}
