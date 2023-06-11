package com.pavelhladki.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Wall implements Structure, Serializable {
    private List<Block> blocks;
    private String color;
    private String material;

    public Wall(List<Block> blocks, String color, String material) {
        this.blocks = blocks;
        this.color = color;
        this.material = material;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return Objects.equals(blocks, wall.blocks) && Objects.equals(color, wall.color)
                && Objects.equals(material, wall.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blocks, color, material);
    }
}
