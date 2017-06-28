package com.questdb.misc;

import com.questdb.std.str.CompositePath;
import com.questdb.std.str.LPSZ;

public class FilesFacadeImpl implements FilesFacade {

    public static final FilesFacade INSTANCE = new FilesFacadeImpl();

    @Override
    public int close(long fd) {
        return Files.close(fd);
    }

    @Override
    public int errno() {
        return Os.errno();
    }

    @Override
    public boolean exists(LPSZ path) {
        return Files.exists(path);
    }

    @Override
    public void findClose(long findPtr) {
        Files.findClose(findPtr);
    }

    @Override
    public long findFirst(LPSZ path) {
        return Files.findFirst(path);
    }

    @Override
    public long findName(long findPtr) {
        return Files.findName(findPtr);
    }

    @Override
    public boolean findNext(long findPtr) {
        return Files.findNext(findPtr);
    }

    @Override
    public int findType(long findPtr) {
        return Files.findType(findPtr);
    }

    @Override
    public long getOpenFileCount() {
        return Files.getOpenFileCount();
    }

    @Override
    public long getPageSize() {
        return Files.PAGE_SIZE;
    }

    @Override
    public long length(long fd) {
        return Files.length(fd);
    }

    @Override
    public long length(LPSZ name) {
        return Files.length(name);
    }

    @Override
    public int mkdirs(LPSZ path, int mode) {
        return Files.mkdirs(path, mode);
    }

    @Override
    public long mmap(long fd, long len, long offset, int mode) {
        return Files.mmap(fd, len, offset, mode);
    }

    @Override
    public void munmap(long address, long size) {
        Files.munmap(address, size);
    }

    @Override
    public long openAppend(LPSZ name) {
        return Files.openAppend(name);
    }

    @Override
    public long openRO(LPSZ name) {
        return Files.openRO(name);
    }

    @Override
    public long openRW(LPSZ name) {
        return Files.openRW(name);
    }

    @Override
    public long read(long fd, long buf, int len, long offset) {
        return Files.read(fd, buf, len, offset);
    }

    @Override
    public boolean rmdir(CompositePath name) {
        return Files.rmdir(name);
    }

    @Override
    public boolean truncate(long fd, long size) {
        return Files.truncate(fd, size);
    }

    @Override
    public long write(long fd, long address, long len, long offset) {
        return Files.write(fd, address, len, offset);
    }
}
