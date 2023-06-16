import java.beans.*;

public class BeanDemo {
    private String name;
    private int age;

    public BeanDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            BeanDemo bean = new BeanDemo();
            BeanInfo beanInfo = Introspector.getBeanInfo(BeanDemo.class);

            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String propertyName = propertyDescriptor.getName();

                if (propertyDescriptor.getWriteMethod() != null) {
                    if(propertyName.equals("name")){
                        propertyDescriptor.getWriteMethod().invoke(bean, "Kabir Deula");
                    }else if(propertyName.equals("age")){
                        propertyDescriptor.getWriteMethod().invoke(bean, 22);
                    }
                }
            }

            System.out.println("Name: " + bean.getName());
            System.out.println("Age: " + bean.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
