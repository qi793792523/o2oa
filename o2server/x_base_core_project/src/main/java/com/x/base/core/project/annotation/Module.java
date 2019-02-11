package com.x.base.core.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记所有可启动模块
 * 
 * @author zhour
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Module {

	public static final String PARAMETER_TYPE = "type";

	public static final String PARAMETER_NAME = "name";

	public static final String PARAMETER_CATEGORY = "category";

	public ModuleType type();

	public ModuleCategory category();

	public String name();

}