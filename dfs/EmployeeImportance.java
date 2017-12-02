/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {     
    int totalval = 0;
    Map<Integer, Employee> emap;
    public int getImportance(List<Employee> employees, int id) {
        emap = new HashMap();
        for(Employee e: employees) {
            System.out.println(e.id);
            emap.put(e.id,e);
        }
        return getvalue(id);
    }
    
    public int getvalue(int id) {
        Employee employee = emap.get(id);
        totalval = employee.importance;
        for(int s : employee.subordinates)
            totalval += getvalue(s);
        
        return totalval;
    }
}