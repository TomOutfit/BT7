package phonesystem;

public abstract class Phone {
   
    protected String name, Phone, newPhone;

    public Phone(String name, String phone, String newPhone) {
        this.name = name;
        Phone = phone;
        this.newPhone = newPhone;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return Phone;
    }


    public void setPhone(String phone) {
        Phone = phone;
    }


    public String getNewPhone() {
        return newPhone;
    }


    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }


    public abstract void insertPhone();
    public abstract void removePhone();
    public abstract void updatePhone();
    public abstract void searchPhone();
    public static void sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }


    @Override
    public String toString() {
        return "Phone [name=" + name + ", Phone=" + Phone + ", newPhone=" + newPhone + "]";
    }

 
}