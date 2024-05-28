import java.util.ArrayList;

public class Company {
    private ArrayList<IT> IT;
    private ArrayList<Designer> Designer;
    private ArrayList<Manager> Manager;
    private static double avarageSalary;


    public Company() {
        this.IT = new ArrayList<>();
        this.Designer = new ArrayList<>();
        this.Manager = new ArrayList<>();
    }
    public static double getAvarageSalary() {
        return avarageSalary;
    }
    public static void setAvarageSalary(double avarageSalary) {
        Company.avarageSalary = avarageSalary;
    }

    public ArrayList<IT> getIT() {
        return IT;
    }

    public void setIT(ArrayList<IT> IT) {
        this.IT = IT;
    }

    public ArrayList<Designer> getDesigner() {
        return Designer;
    }

    public void setDesigner(ArrayList<Designer> designer) {
        Designer = designer;
    }

    public ArrayList<Manager> getManager() {
        return Manager;
    }

    public void setManager(ArrayList<Manager> manager) {
        Manager = manager;
    }

    public void addIT(IT it) {
        IT.add(it);
        System.out.println("We add this IT specialist: " + it.getName() + " to our company");
    }

    public void addDesigner(Designer designer) {
        Designer.add(designer);
        System.out.println("We add this Designer: " + designer.getName() + " to our company");
    }

    public void addManager(Manager manager) {
        Manager.add(manager);
        System.out.println("We add this Manager: " + manager.getName() + " to our company");
    }
    public void removeIT(String name) {
        for (IT it : IT) {
            if (it.getName().equals(name)) {
                IT.remove(it);
                System.out.println("We remove this IT specialist: " + name + " from our company");
                return;
            }
        }
        System.out.println("This IT specialist is not in our company");
    }


    public void removeDesigner(String name) {
        for (Designer designer : Designer) {
            if (designer.getName().equals(name)) {
                Designer.remove(designer);
                System.out.println("We remove this Designer: " + designer.getName() + " from our company");
                return;
            }else {
                System.out.println("This Designer is not in our company");
            }
        }

    }
    public void removeManager(String name) {
        for (Manager manager : Manager) {
            if (manager.getName().equals(name)) {
                Manager.remove(manager);
                System.out.println("We remove this Manager: " + manager.getName() + " from our company");
                return;
            }
        }
        System.out.println("This Manager is not in our company");
    }
    public void listSpecialists() {
        System.out.println("-----------------------------------");
        System.out.println("List of IT specialists:");
        for (IT it : IT) {
            System.out.println(it.getName() + " " + it.getSalary() + "$");
        }
        System.out.println("List of Designers:");
        for (Designer designer : Designer) {
            System.out.println(designer.getName()+ " " + designer.getSalary() + "$");
        }
        System.out.println("List of Managers:");
        for (Manager manager : Manager) {
            System.out.println(manager.getName()+ " " + manager.getSalary() + "$");
        }
        System.out.println("-----------------------------------");
    }
    public void hiddenSalary(){
        int itSalary = 0;
        int designerSalary = 0;
        int managerSalary = 0;
        int allSalary = 0;
        for (IT it : IT ) {
            itSalary += it.getSalary();
        }
        for (Designer designer : Designer) {
            designerSalary += designer.getSalary();
        }
        for (Manager manager : Manager) {
            managerSalary += manager.getSalary();
        }
        allSalary = itSalary + designerSalary + managerSalary;
        System.out.println("All salary company: " + allSalary);
    }
    public static void avarageSalary(Company company) {
        int itSalary = 0;
        int designerSalary = 0;
        int managerSalary = 0;
        int allSalary = 0;
        for (IT it : company.getIT()) {
            itSalary += it.getSalary();
        }
        for (Designer designer : company.getDesigner()) {
            designerSalary += designer.getSalary();
        }
        for (Manager manager : company.getManager()) {
            managerSalary += manager.getSalary();
        }
        allSalary = itSalary + designerSalary + managerSalary;
        avarageSalary = allSalary / (company.getIT().size() + company.getDesigner().size() + company.getManager().size());
        System.out.println("Average salary company: " + avarageSalary);
    }


}