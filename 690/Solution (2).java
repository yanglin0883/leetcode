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
    public int getImportance(List<Employee> employees, int id) {
        if(employees == null && employees.size()==0) return 0;
        for(Employee i: employees){
            hm.put(i.id, i);
        }
        // System.out.println(hm.entrySet());
        return getImportance2(employees, id);
    }
    Map<Integer, Employee> hm = new HashMap<>();
    public int getImportance2(List<Employee> employees, int id) {
        Employee cur = hm.get(id);
        int res=cur.importance;
        for(Integer i: cur.subordinates){
            res = res + getImportance2(employees, i);
        }
        return res;
    }
}