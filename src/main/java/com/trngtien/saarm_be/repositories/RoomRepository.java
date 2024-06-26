package com.trngtien.saarm_be.repositories;

import com.trngtien.saarm_be.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface RoomRepository extends JpaRepository<Room, UUID> { }
