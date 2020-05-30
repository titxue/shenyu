package org.dromara.soul.client.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Soul client.
 *
 * @author xiaoyu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface SoulHttpClient {
    
    /**
     * 提供出去的接口路径
     * Path string.
     *
     * @return the string
     */
    String path();
    
    /**
     * Rule name string.
     *
     * @return the string
     */
    String ruleName();
    
    /**
     * 接口路径描述,方便用户选择.
     *
     * @return String string
     */
    String desc();
    
    /**
     * Rpc type string.
     *
     * @return the string
     */
    String rpcType() default "http";
    
    /**
     * Write meta data boolean.
     *
     * @return the boolean
     */
    boolean writeMetaData() default false;
    
    /**
     * Enabled boolean.
     *
     * @return the boolean
     */
    boolean enabled() default true;
}
