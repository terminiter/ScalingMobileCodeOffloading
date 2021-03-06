/*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* Please send inquiries to huber AT ut DOT ee
*/

package edu.ut.mobile.network;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cs.mc.ut.ee.utilities.ParametersSimulator;


public class Pack implements Serializable{
    private static final long serialVersionUID = 1;
    String functionName = null;
    Class stateType = null;
    Object state = null;
    Object[] paramValues = null;
    Class[] paramTypes = null;
    
    
    //Timestamps
    List<String> timestamps = new ArrayList<String>();
    
    int accGroup = 0;
    double RTT = 0;
    double energy = 0;
    

    public Pack(String functionName, Class stateType, Object state, Object[] paramValues, Class[] FuncDTypes) {
        this.functionName = functionName;
        this.stateType = stateType;
        this.state = state;
        this.paramValues = paramValues;
        this.paramTypes = FuncDTypes;
        timestamps.add(System.currentTimeMillis()+",client1");
        
        accGroup = ParametersSimulator.GenerateInts(0, 5);
        RTT = ParametersSimulator.GenerateDouble(0, 1000);
        energy = ParametersSimulator.GenerateDouble(0, 100);
        
    }

    public String getfunctionName(){
        return functionName;
    }
    
    public Class getstateType(){
        return stateType;
    }

    public Object[] getparamValues(){
        return paramValues;
    }

    public Class[] getparamTypes(){
        return paramTypes;
    }

    public Object getstate(){
        return state;
    }
    
    public List<String> getTimeStamps(){
    	return timestamps;
    }
    
    public int getDeviceAccGroup(){
    	return accGroup;
    }
    
    public double getDeviceRTT(){
    	return RTT;
    }
    
    public double getDeviceEnergy(){
    	return energy;
    }
    
}
