package com.directi.training.ocp.solution_exercice;

public class MainClass {
    public static void main(String[] args) {
        Resource timeSlot = new TimeSlot();
        ResourceAllocator resourceAllocator = new ResourceAllocator(timeSlot);
        int resourceId = resourceAllocator.allocate();
        resourceAllocator.free(resourceId);
    }
}
