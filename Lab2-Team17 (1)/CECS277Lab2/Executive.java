//create Executive class that extends from Manager class
    public class Executive extends Manager{
        
        //argument Executive class
        public Executive(){
            super(); //call Manager
        }

        //argument Manager constructor
        public Executive(String name, Double salary){
            super(name,salary); //call Manager(name, salary)
            department = "Finance";
        }

        /**
         * @Override toString method
         * @return a string of the manager's name, department, and salary
         */
        public String toString() {
            return "Executive{" +
                    "name: " + super.getName() + '\n' +
                    "department: " + super.department + '\n' +
                    "salary: " + super.getSalary() +
                    '}';
        }
    }//end Executive class
