package org.liuchen.code.utils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * Object工具类
 */
public class ObjectHelper {
    /**
     * 判断对象o是否为null或者空串
     *
     * @param o
     * @return
     */
    public static boolean isNullOrEmptyString(Object o) {
        return o == null ? true : o.toString().length() == 0;
    }

    /**
     *
     * @param o
     * @return
     */
    public static boolean isEmpty(Object o) {
        if (null == o) {
            return true;
        } else {
            if (o instanceof String) {
                if (((String) o).length() == 0) {
                    return true;
                }
            } else if (o instanceof Collection) {
                if (((Collection) o).isEmpty()) {
                    return true;
                }
            } else if (o.getClass().isArray()) {
                if (Array.getLength(o) == 0) {
                    return true;
                }
            } else {
                if (!(o instanceof Map)) {
                    return false;
                } else {
                    if (((Map) o).isEmpty()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

    public static boolean isAllNull(Object... objects) {
        Object[] var1 = objects;
        int var2 = objects.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Object object = var1[var3];
            if (object != null) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllNotNull(Object... objects) {
        Object[] var1 = objects;
        int var2 = objects.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Object object = var1[var3];
            if (object == null) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllEmpty(Object... objects) {
        for (int i = 0; i < objects.length; ++i) {
            if (!isNullOrEmptyString(objects[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllNotEmpty(Object... objects) {
        for (int i = 0; i < objects.length; ++i) {
            if (isNullOrEmptyString(objects[i])) {
                return false;
            }
        }

        return true;
    }
}
