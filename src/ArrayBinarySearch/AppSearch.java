package ArrayBinarySearch;

public class AppSearch {
    public static void main(String[] args) {

        AppSearch app = new AppSearch();
        int[] array = new int[]{99, 92, 85, 80, 73, 67, 61, 56, 49, 43, 38, 34, 29, 26, 19, 13, 9, 4, 1, -5, -20};
        int target = 92;
        app.printResult(array.length-1, app.binarySearch(array,target));
    }

    private int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private void printResult(int length, int result){
        if(result==0){
            System.out.println("Left corner! Index of target: "+result);
        } else if (result==length){
            System.out.println("Right corner! Index of target: "+result);
        } else if(result<=length/2){
            System.out.println("Left side! Index of target: "+result);
        } else {
            System.out.println("Right side! Index of target: "+result);
        }
    }
}

