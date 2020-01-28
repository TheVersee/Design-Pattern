/*
 * Alt + Shift + F to indent lines.
 */
package builder;

/**
 *
 * @author Vinayak
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String midName;
    
    private User(UserBuilder userbuilder){
        this.id=userbuilder.id;
        this.firstName=userbuilder.firstName;
        this.lastName=userbuilder.lastName;
        this.midName=userbuilder.midName;
    }
    
    public static class UserBuilder{
        private int id;
        private String firstName;
        private String lastName;
        private String midName;

        public UserBuilder(String firstName) {
            this.firstName = firstName;
        }
        

        public int getId() {
            return id;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getMidName() {
            return midName;
        }

        public UserBuilder setMidName(String midName) {
            this.midName = midName;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
        
    }
    @Override
        public String toString() {
            return "UserBuilder{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midName=" + midName + '}';
        }
    
}
