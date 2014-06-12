/*
 * Hivemall: Hive scalable Machine Learning Library
 *
 * Copyright (C) 2013
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H25PRO-1520
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package hivemall.tools.array;

import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class SubarrayStartWithUDF extends UDF {

    public List<IntWritable> evaluate(List<IntWritable> original, IntWritable key) {
        if(original == null) {
            return null;
        }
        int fromIndex = original.indexOf(key);
        if(fromIndex == -1) {
            return null;
        }
        int toIndex = original.size();
        return original.subList(fromIndex, toIndex);
    }

    public List<Text> evaluate(List<Text> original, Text key) {
        if(original == null) {
            return null;
        }
        int fromIndex = original.indexOf(key);
        if(fromIndex == -1) {
            return null;
        }
        int toIndex = original.size();
        return original.subList(fromIndex, toIndex);
    }

}
