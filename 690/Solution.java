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
        int cur = findId(employees, id);
        if(cur==-1) return 0;
        int res=employees.get(cur).importance;
        for(Integer i: employees.get(cur).subordinates){
            res = res + getImportance(employees, i);
        }
        return res;
    }
    int findId(List<Employee> e, int id){
        for(int i=0;i<e.size();i++){
            if(e.get(i).id == id) return i;
        }
        return -1;
    }
}