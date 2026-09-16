class RandomizedSet {
    ArrayList<Integer> l ;
    public RandomizedSet() {
        l= new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(l.contains(val)){
            return false;
        }
        else{
            l.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(l.contains(val)){
            l.remove(Integer.valueOf(val));
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        Random r =new Random();
        return l.get(r.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */