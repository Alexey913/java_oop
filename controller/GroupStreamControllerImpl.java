package controller;

import java.util.List;

import data.GroupStream;
import service.GroupStreamServiceImpl;

public class GroupStreamControllerImpl implements GroupStreamController<GroupStream, Integer> {

    private final GroupStreamServiceImpl groupStreamServiceImpl;

    public GroupStreamControllerImpl(GroupStreamServiceImpl groupStreamServiceImpl) {
        this.groupStreamServiceImpl = groupStreamServiceImpl;
    }

    @Override
    public GroupStream save(GroupStream entity) {
        return this.groupStreamServiceImpl.saveGroupStream(entity);
    }

    @Override
    public GroupStream findById(Integer id) {
        return this.groupStreamServiceImpl.findByIdGroupStream(id);
    }

    @Override
    public List<GroupStream> sortGroupStream(List<GroupStream> entityStream) {
        this.groupStreamServiceImpl.sortGroupStream(entityStream);
        return entityStream;
    }
}