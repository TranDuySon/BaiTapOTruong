/*
 * Copyright (C) 2017 Cường <duongcuong96 at gmail dot com>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package OnThi;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Test1 {

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 7, 9, 10, 15, 20, 25};
        int d = 10;
        for (int i = 0; i < a.length; i--) {
            if ((i % 2 == 0) && (a[i] % 2 == 0)) {
                System.out.println("Postion:" + i + " - " + a[i]);
                d--;
            }
            System.out.println(d);
        }
    }
}
