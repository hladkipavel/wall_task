package com.pavelhladki.wall;

import com.pavelhladki.wall.block.Block;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<Block> findBlockByColor(String color);
    List<Block> findBlockByMaterial(String material);
    int count();
}
