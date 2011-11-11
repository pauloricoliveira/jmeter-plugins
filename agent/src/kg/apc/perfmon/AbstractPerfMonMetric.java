package kg.apc.perfmon;

import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarProxy;

/**
 *
 * @author undera
 */
public abstract class AbstractPerfMonMetric {

    protected final SigarProxy sigarProxy;

    public AbstractPerfMonMetric(SigarProxy aSigar) {
        sigarProxy = aSigar;
    }

    protected long getPIDByProcName(String name, int index) {
        return 0;
    }

    public void setParams(String params) {
    }

    abstract public void getValue(StringBuilder res) throws SigarException;
}
