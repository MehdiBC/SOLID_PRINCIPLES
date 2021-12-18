package com.directi.training.ocp.solution_exercice;

public class ResourceAllocator {
    private final Resource _resource;

    public ResourceAllocator(Resource resource) {
        this._resource = resource;
    }

    public int allocate(){
        int resourceId = this._resource.findFree();
        this._resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId){
        this._resource.markFree(resourceId);
    }
}
