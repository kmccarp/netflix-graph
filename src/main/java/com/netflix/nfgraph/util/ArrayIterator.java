/*
 *  Copyright 2013 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.nfgraph.util;

import java.util.Iterator;

/**
 * A simple implementation of {@link Iterator} over an array of objects.
 * 
 * It is unlikely that this class will be required externally.
 */
public class ArrayIterator<T> implements Iterator<T> {

    private T[] arr;
    private int size;
    private int counter;
    
    public ArrayIterator(T[] arr) {
        this(arr, arr.length);
    }
    
    public ArrayIterator(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    
    @Override
    public boolean hasNext() {
        return counter < size;
    }

    @Override
    public T next() {
        return arr[counter++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from this array.");
    }
    
}
