package org.liuchen.code.db.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectionUtils {

    public static final String CGLIB_CLASS_SEPARATOR = "$$";
    private static final Logger log = LoggerFactory.getLogger(ReflectionUtils.class);

    public static Object instance(String className) {
        log.trace("instance for {}", className);

        try {
            Class e = Class.forName(className);
            return e.newInstance();
        } catch (ClassNotFoundException var2) {
            log.error("[无法找到方言类]", var2);
            return null;
        } catch (InstantiationException var3) {
            log.error("[实例化方言错误]", var3);
            return null;
        } catch (IllegalAccessException var4) {
            log.error("[实例化方言错误]", var4);
            return null;
        }
    }
}
