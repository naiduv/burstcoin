/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 21 21:16:45 GMT 2017
 */

package brs.crypto.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brs.crypto.hash.Digest;
import brs.crypto.hash.RIPEMD;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RIPEMD_ESTest extends RIPEMD_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)44;
      byte[] byteArray1 = rIPEMD0.digest(byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)44}, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      byte[] byteArray0 = new byte[9];
      rIPEMD0.makeMDPadding();
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      // Undeclared exception!
      try { 
        rIPEMD0.digest(byteArray0, 5, (-937));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, rIPEMD0.getBlockLength());
      
      rIPEMD0.engineReset();
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, rIPEMD0.getBlockLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      rIPEMD0.doInit();
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, rIPEMD0.getBlockLength());
      
      // Undeclared exception!
      try { 
        rIPEMD0.processBlock((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.crypto.hash.RIPEMD", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        rIPEMD0.processBlock(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("brs.crypto.hash.RIPEMD", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      // Undeclared exception!
      try { 
        rIPEMD0.doPadding((byte[]) null, 1013904242);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.crypto.hash.RIPEMD", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        rIPEMD0.doPadding(byteArray0, (byte) (-97));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -97
         //
         verifyException("brs.crypto.hash.RIPEMD", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      
      int int0 = rIPEMD0.getBlockLength();
      assertEquals(64, int0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
      
      int int0 = rIPEMD0.getDigestLength();
      assertEquals(16, int0);
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(64, rIPEMD0.getBlockLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      Digest digest0 = rIPEMD0.copy();
      assertNotNull(digest0);
      assertFalse(digest0.equals((Object)rIPEMD0));
      assertNotSame(rIPEMD0, digest0);
      assertNotSame(digest0, rIPEMD0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      assertEquals(64, digest0.getBlockLength());
      assertEquals(16, digest0.getDigestLength());
      assertEquals("RIPEMD", digest0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      assertNotNull(rIPEMD0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
      
      String string0 = rIPEMD0.toString();
      assertNotNull(string0);
      assertEquals("RIPEMD", string0);
      assertEquals(64, rIPEMD0.getBlockLength());
      assertEquals("RIPEMD", rIPEMD0.toString());
      assertEquals(16, rIPEMD0.getDigestLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RIPEMD rIPEMD0 = new RIPEMD();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = rIPEMD0.digest(byteArray0);
      rIPEMD0.doPadding(byteArray1, (byte)0);
      assertEquals(64, rIPEMD0.getBlockLength());
  }
}