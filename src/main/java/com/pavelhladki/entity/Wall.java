package com.pavelhladki.wall.entity;

import com.pavelhladki.wall.block.Block;
import com.pavelhladki.wall.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for(Block block : blocks) {
            if(block.getColor().equals(color)){
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlockByMaterial(String material) {
        List<Block> matchingBlocks = new ArrayList<>();
        for(Block block : blocks) {
            if(block.getMaterial().equals(material)){
                matchingBlocks.add(block);
            }
        }
        return matchingBlocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
