package Linear_Search;

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class leet1672 {

    public int maximumWealth(int[][] accounts){

        int maxWealth = 0;
        for(int i=0; i<accounts.length; i++){
            int totalwealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                totalwealth += accounts[i][j];
            }
            if(totalwealth > maxWealth) maxWealth=totalwealth;
        }

        return maxWealth;
    }
    
}
