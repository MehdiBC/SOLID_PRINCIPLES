package com.directi.training.ocp.solution_exercice;

public class MainClass {
    public static void main(String[] args) {
        ResourceManager timeSlot = new TimeSlotManager();
        ResourceAllocator resourceAllocator = new ResourceAllocator(timeSlot);
        int resourceId = resourceAllocator.allocate();
        resourceAllocator.free(resourceId);
    }
}
