package com.management.system.service;

import com.management.system.model.Submit;
import com.management.system.repo.SubmitRepo;
import com.management.system.repo.SubmitRepoManager;

public class SubmitServiceManager implements SubmitService{
    private SubmitRepo submitRepo;

    public SubmitServiceManager() {
        this.submitRepo = new SubmitRepoManager();
    }

    @Override
    public Boolean add(Submit submit) {
        return submitRepo.add(submit);

    }
}
