package com.xkcoding.model.po;

import java.io.Serializable;

/**
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:38
 * @since jdk1.8
 */
public class SysClientDetailsPo implements Serializable {
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

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    /**
     *
     */
    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    /**
     *
     */
    public void setAuthorizations(String authorizations) {
        this.authorizations = authorizations;
    }

    /**
     *
     */
    public String getAuthorizations() {
        return authorizations;
    }

    /**
     *
     */
    public void setAutoApproveScopes(String autoApproveScopes) {
        this.autoApproveScopes = autoApproveScopes;
    }

    /**
     *
     */
    public String getAutoApproveScopes() {
        return autoApproveScopes;
    }

    /**
     *
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     *
     */
    public String getClientId() {
        return clientId;
    }

    /**
     *
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     *
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     *
     */
    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    /**
     *
     */
    public String getGrantTypes() {
        return grantTypes;
    }

    /**
     *
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     *
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     *
     */
    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    /**
     *
     */
    public Integer getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    /**
     *
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     *
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     *
     */
    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    /**
     *
     */
    public String getScopes() {
        return scopes;
    }
}
