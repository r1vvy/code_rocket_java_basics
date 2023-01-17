package lesson2.task22;

public class SortFriends {
    private String[] friends;

    public SortFriends(String[] friends) {
        this.friends = selectionSort(friends);
    }

    private String[] selectionSort(String arr[])
    {
        String[] sortedArray = arr;
        int n = sortedArray.length;
        for(int i = 0; i < n - 1; i++)
        {
            int min_index = i;
            String minStr = sortedArray[i];
            for(int j = i + 1; j < n; j++)
            {
                if(sortedArray[j].compareTo(minStr) < 0)
                {
                    // Make arr[j] as minStr and update min_idx
                    minStr = sortedArray[j];
                    min_index = j;
                }
            }
            if(min_index != i)
            {
                String temp = sortedArray[min_index];
                sortedArray[min_index] = sortedArray[i];
                sortedArray[i] = temp;
            }
        }
        return sortedArray;
    }

    public void printInfo() {
        for (String friend: this.friends) {
            System.out.println(friend);
        }
    }
}
