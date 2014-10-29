package org.openhab.binding.xbmc.rpc.api.model.list.filter;

public enum Operator {
	contains, 
    doesnotcontain, 
    is, 
    isnot, 
    startswith, 
    endswith, 
    greaterthan, 
    lessthan, 
    after, 
    before, 
    inthelast, 
    notinthelast, 
    True, 
    False, 
    between;
}
