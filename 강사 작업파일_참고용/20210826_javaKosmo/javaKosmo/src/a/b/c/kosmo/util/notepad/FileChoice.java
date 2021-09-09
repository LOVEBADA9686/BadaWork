package a.b.c.kosmo.util.notepad;
//filechooser������ FileFilter ���� Ŭ����

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

//FileFilter�� abstractŬ�����̱� ������ �ݵ�� �������̵� ���� �޼��尡 �ִ�.
//�ڼ�Ŭ������ abstract�� �ƴ� �̻�.....
public class FileChoice extends FileFilter {
	String tmp="";
	String tmp1="";
	
	//�������� �������͸� �ϱ� ����, �������� �Ű������� ���� ���޹޴´�.
	//�� ���� ����, �����׸� ���� String���� �ް�,
	//lastIndex�� substring�� ���� Ȯ���ڸ� ����.
	FileChoice(String tmp){
		this.tmp = tmp;
	    int j = tmp.lastIndexOf('.');
		this.tmp1 = tmp.substring(j+1).toLowerCase();
	}

	public boolean accept(File f) {
		if (f.isDirectory()) {
            return true;
     }

	String extension = getExtension(f);

	if (extension != null) {
	    if (extension.equals(tmp1)){
		    return true;
		}else {
            return false;
        }
  	}
		return false;
    }

	//�ݵ�� �����ؾ� �ϴ� �޼����, ���������� �Ʒ� �������� ������ �� ���ڿ��̴�.
	 public String getDescription() {
        return tmp;
     }

	//���� �ȿ� �ִ� ������, ���ϴ� Ȯ������ ���ϸ��� ��󳻴� �޼���(���ϰ��� ���ϸ��̴�.)
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
	    }
		    return ext;
	    }
}
