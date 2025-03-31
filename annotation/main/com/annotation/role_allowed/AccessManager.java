package annotation.role_allowed;


import java.lang.reflect.Method;

public class AccessManager {

    public static void executeMethod(User user, Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                for (String role : roleAllowed.value()) {
                    if (role.equals(user.getRole())) {
                        method.invoke(obj);  // Execute the method if role matches
                        return;
                    }
                }
                System.out.println("Access Denied!");
            } else {
                System.out.println("No role restriction found, executing method...");
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
