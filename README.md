# Interpolation Search
Add a Interpolation Search using JAVA language.

# About Interpolation Search
Interpolation search is an improved variant of binary search. This search algorithm works on the probing position of the required value. For this algorithm
to work properly, the data collection should be in a sorted form and equally distributed. interpolation search may go to different locations according to the value
of the key being searched. For example, if the value of the key is closer to the last element, interpolation search is likely to start search toward the end side.

# Java
    
   Step 1: 
   
   Interpolation search works on sorted arrays. So, sorted the array if arrays will unsorted.
   
   Step 2:
   
   We have to use the below formula to calculate the mid of the array -
    
    int index = low + ((value - numbers[low]) * (high - low)) / (numbers[high] - numbers[low]);
  
   Step 3:
   
          while (low <= high && value >= numbers[low] && value <= numbers[high]) {

            int index = low + ((value - numbers[low]) * (high - low)) / (numbers[high] - numbers[low]);

            if (numbers[index] < value) {
                low = index + 1;
            } else if (numbers[index] > value) {
                high = index - 1;
            } else {
                isFound = true;
                System.out.println(value + " found at index: " + index);
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Element not found!");
        }
